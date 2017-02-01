
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/ronaldbjork/playworkspace/play-scala-intro/conf/routes
// @DATE:Thu Jan 26 10:03:59 PST 2017

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReversePersonController PersonController = new controllers.ReversePersonController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseAssets Assets = new controllers.ReverseAssets(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseMedController MedController = new controllers.ReverseMedController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseHealthController HealthController = new controllers.ReverseHealthController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseRecommendationController RecommendationController = new controllers.ReverseRecommendationController(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReversePersonController PersonController = new controllers.javascript.ReversePersonController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseAssets Assets = new controllers.javascript.ReverseAssets(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseMedController MedController = new controllers.javascript.ReverseMedController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseHealthController HealthController = new controllers.javascript.ReverseHealthController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseRecommendationController RecommendationController = new controllers.javascript.ReverseRecommendationController(RoutesPrefix.byNamePrefix());
  }

}
