package com.zbl.domain;

import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldIndex;
import org.springframework.data.elasticsearch.annotations.FieldType;

/**
 * @author zhaobaolong
 * @Title: ProductAttrbuite
 * @ProjectName springboot
 * @Description: TODO
 * @date 2019/1/410:10
 */
public class ProductAttrbuite {
	private static final long serialVersionUID = 1L;
	private Long id;
	private Long productAttributeId;
	//属性值
	@Field(index = FieldIndex.not_analyzed, type = FieldType.String)
	private String value;
	//属性参数：0->规格；1->参数
	private Integer type;
	//属性名称
	@Field(index = FieldIndex.not_analyzed, type = FieldType.String)
	private String name;
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getProductAttributeId() {
		return productAttributeId;
	}

	public void setProductAttributeId(Long productAttributeId) {
		this.productAttributeId = productAttributeId;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}