(ns org.deeplearning4j.ui.play.staticroutes.Assets
  "Simple function for serving assets. Assets are assumed to be in the specified root directory"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.ui.play.staticroutes Assets]))

(defn ->assets
  "Constructor."
  (^Assets []
    (new Assets )))

(defn apply
  "s - `java.lang.String`

  returns: `play.mvc.Result`"
  (^play.mvc.Result [^Assets this ^java.lang.String s]
    (-> this (.apply s))))

