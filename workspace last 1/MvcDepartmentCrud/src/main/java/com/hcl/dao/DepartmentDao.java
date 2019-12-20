package com.hcl.dao;

	import java.sql.ResultSet;
	import java.sql.SQLException;
	import java.util.List;

	import org.springframework.jdbc.core.BeanPropertyRowMapper;
	import org.springframework.jdbc.core.JdbcTemplate;
	import org.springframework.jdbc.core.RowMapper;

	import com.hcl.beans.Department;
	
	public class DepartmentDao {
		private JdbcTemplate template;

		public JdbcTemplate getTemplate() {
			return template;
		}

		public void setTemplate(JdbcTemplate template) {
			this.template = template;
		}
		
		public int save(Department p){  
		    String sql="insert into Department values(?,?,?,?,?)";
		    int res=template.update(sql, new Object[]{p.getDeptno(),
		    		p.getDeptname(),
		    		p.getLoc(),
		    		p.getCity(),
		    		p.getHead()
		    });
		    
		    return res;  
		}  
		public int update(Department p){  
			String sql="Update Department set Deptname=?, loc=?, city=?, head=? where Deptno=?";
			int res=template.update(sql, new Object[]{
		    		p.getDeptname(),
		    		p.getLoc(),
		    		p.getCity(),
		    		p.getHead(),
		    		p.getDeptno()
		    });
		    return res;  
		}  
		public int delete(int id){  
		    String sql="delete from Department where deptno="+id+"";  
		    return template.update(sql);  
		}  
		public Department getdeptById(int id){  
		    String sql="select * from Department where deptno=?";  
		    return template.queryForObject(sql, new Object[]{id},
		    		new BeanPropertyRowMapper<Department>(Department.class));  
		}  
		public List<Department> getDepartment(){  
		    return template.query("select * from Department",new RowMapper<Department>(){  
		        public Department mapRow(ResultSet rs, int row) throws SQLException {  
		            Department d=new Department();  
		            d.setDeptno(rs.getInt("deptno"));
		            d.setDeptname(rs.getString("deptname"));
		            d.setLoc(rs.getString("loc"));
		            d.setCity(rs.getString("city"));
		            d.setHead(rs.getString("head"));
		            return d;  
		        }  
		    });  
		}  
	}


