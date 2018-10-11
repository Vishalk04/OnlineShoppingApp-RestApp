package com.yash.ECommerceApp.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.yash.ECommerceApp.models.Product;

@Repository
public class ProductDaoImpl implements IProductDao {


	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public Boolean addProduct(Product product) {
		
		// TODO Auto-generated method stub
		/*Session session = sessionFactory.openSession();
		session.save(product);*/
		jdbcTemplate.update("INSERT INTO product (productId, title, price) VALUES (?, ?, ?)",
				product.getProductId(), product.getTitle(), product.getPrice());
		return true; 
		
	}

	@Override
	public Product findById(Integer productId) {
		
		// TODO Auto-generated method stub
		/*Session session = sessionFactory.openSession();
		Product product = session.get(Product.class, productId);
		*/
		;
		
		Product product = (Product) jdbcTemplate.queryForObject("SELECT * FROM product where productId= ? ",
	            new Object[] { productId }, new BeanPropertyRowMapper(Product.class));
	 
	        return product;
			
	}
	
	

	@Override
	public List<Product> findByCriteria(String criteria, String value) {
		// TODO Auto-generated method stub
		return null;
	}
}