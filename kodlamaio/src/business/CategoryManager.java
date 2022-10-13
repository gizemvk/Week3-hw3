package business;

import core.logging.ILogger;
import dataAccess.categoryDao.ICategoryDao;
import entities.Category;

import java.util.List;

public class CategoryManager {

    private ICategoryDao iCategoryDao;
    private ILogger [] iLoggers;
private List< Category> categories;

    public CategoryManager(ICategoryDao iCategoryDao, ILogger[] iLoggers, List<Category> categories) {
        this.iCategoryDao = iCategoryDao;

        this.iLoggers = iLoggers;
        this.categories = categories;
    }
 public void add (Category category) throws Exception {

        iCategoryDao.add(category);

     for ( ILogger logger:iLoggers
          ) {
         logger.log(category.getCategoryName());
     }

     for ( Category ctgry: categories) {

         if ( ctgry.getCategoryName().equals( category.getCategoryName() )){
             throw new Exception("Kategori ismi birbirini tekrar edemez");
         }
         categories.add( category);

     }

 }








}
