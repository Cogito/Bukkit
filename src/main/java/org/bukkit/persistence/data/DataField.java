package org.bukkit.persistence.data;

// TODO : Document!
public interface DataField
{
	public void setType(DataType type);
	
	public DataType getType();
	
	public void setValue(Object value);
	
	public Object getValue();
	
	public Object getValue(Class<?> targetClass);
	
	public void setName(String name);

	public String getName();

	public void setAutogenerated(boolean autogenerate);
	
	public boolean isAutogenerated();

	public void setIdField(boolean id);
	
	public boolean isIdField();
}
