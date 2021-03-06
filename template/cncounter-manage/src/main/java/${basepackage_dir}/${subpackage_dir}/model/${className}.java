<#include "/macro.include"/>
<#include "/java_copyright.include">
<#assign className = table.className>   
<#assign classNameLower = className?uncap_first> 
package ${basepackage}.${subpackage}.model;

import java.io.Serializable;
import java.util.Date;

/**
 * ${table.tableAlias}
 * @version 1.0
 * @author
 */
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class ${className} implements Serializable {

	<#list table.columns as column>
	// ${column.columnAlias}
	private ${column.simpleJavaType} ${column.columnNameLower};
	</#list>

}
