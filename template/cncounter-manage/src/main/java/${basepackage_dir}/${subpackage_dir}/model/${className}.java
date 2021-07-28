<#include "/macro.include"/>
<#include "/java_copyright.include">
<#assign className = table.className>   
<#assign classNameLower = className?uncap_first> 
package ${basepackage}.${subpackage}.model;

import java.io.Serializable;
import java.util.Date;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * ${table.tableAlias}
 * @author: mengya
 * @Date: ${sysdate}
 */
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
@ApiModel("${table.tableAlias}")
public class ${className} implements Serializable {

	<#list table.columns as column>
		/**
		 * ${column.columnAlias}
		 */
		@ApiModelProperty(value = "${column.columnAlias}", dataType = "${column.javaType}")
		private ${column.simpleJavaType} ${column.columnNameLower};
	</#list>

}
