package tw.org.iii.cma.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import tw.org.iii.cma.dao.ProductRepository;
import tw.org.iii.cma.domain.ProductBean;

@Service
@Transactional
public class ProductRepositoryService {
	@Autowired
	private ProductRepository productRepository;

	public List<ProductBean> select(ProductBean bean) {
		List<ProductBean> result = null;
		if(bean!=null && bean.getId()!=null && !bean.getId().equals(0)) {
			Optional<ProductBean> optional = productRepository.findById(bean.getId());
			if(optional.isPresent()) {
				result = new ArrayList<ProductBean>();
				result.add(optional.get());
			}
		} else {
			result = productRepository.findAll();
		}
		return result;
	}
	public ProductBean insert(ProductBean bean) {
		ProductBean result = null;
		if(bean!=null && bean.getId()!=null) {
			boolean exist = productRepository.existsById(bean.getId());
			if(!exist) {
				return productRepository.save(bean);
			}
		}
		return result;
	}
	public ProductBean update(ProductBean bean) {
		ProductBean result = null;
		if(bean!=null && bean.getId()!=null) {
			boolean exist = productRepository.existsById(bean.getId());
			if(exist) {
				return productRepository.save(bean);
			}
		}
		return result;
	}
	public boolean delete(ProductBean bean) {
		boolean result = false;
		if(bean!=null && bean.getId()!=null) {
			boolean exist = productRepository.existsById(bean.getId());
			if(exist) {
				productRepository.deleteById(bean.getId());
				result = true;
			}
		}
		return result;
	}
}
