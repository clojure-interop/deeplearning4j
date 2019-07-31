(ns org.deeplearning4j.ui.play.staticroutes.I18NRoute
  "Route for global internationalization setting"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.ui.play.staticroutes I18NRoute]))

(defn ->i-18-n-route
  "Constructor."
  (^I18NRoute []
    (new I18NRoute )))

(defn apply
  "s - `java.lang.String`

  returns: `play.mvc.Result`"
  (^play.mvc.Result [^I18NRoute this ^java.lang.String s]
    (-> this (.apply s))))

