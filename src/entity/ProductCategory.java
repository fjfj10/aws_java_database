package entity;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class ProductCategory {
	private int productCategoryID;
	private String productCategoryName;
}
