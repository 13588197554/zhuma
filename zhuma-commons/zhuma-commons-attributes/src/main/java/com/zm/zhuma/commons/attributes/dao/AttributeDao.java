package com.zm.zhuma.commons.attributes.dao;

import java.util.List;

import com.zm.zhuma.commons.attributes.model.Attribute;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface AttributeDao<OID> {

	List<Attribute<OID>> getAttrMapByKeys(@Param(value = "tableName") String tableName,
                                          @Param(value = "objectIds") List<OID> objectIds, @Param(value = "keys") List<String> keys);

	void addAttrs(@Param(value = "tableName") String tableName,
                  @Param(value = "attributes") List<Attribute<OID>> attributes);

	void updateAttrs(@Param(value = "tableName") String tableName, @Param("attr") Attribute<OID> attribute);

	void deleteAttrs(@Param(value = "tableName") String tableName, @Param(value = "objectId") OID objectId,
                     @Param(value = "keys") List<String> keys);
	
	List<Attribute<OID>> getAttrMapByKeyAndValue(@Param(value = "tableName") String tableName,
                                                 @Param(value = "objectIds") List<OID> objectIds, @Param(value = "key") String key, @Param(value = "value") Object value);
}