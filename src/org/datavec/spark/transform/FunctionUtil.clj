(ns org.datavec.spark.transform.FunctionUtil
  "Utility methods for Routing"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.spark.transform FunctionUtil]))

(defn ->function-util
  "Constructor."
  (^FunctionUtil []
    (new FunctionUtil )))

(defn *function-0
  "supplier - `java.util.function.Supplier`

  returns: `play.libs.F.Function0<play.mvc.Result>`"
  (^play.libs.F.Function0 [^java.util.function.Supplier supplier]
    (FunctionUtil/function0 supplier)))

(defn *function
  "function - `java.util.function.Function`

  returns: `<T> play.libs.F.Function<T,play.mvc.Result>`"
  ([^java.util.function.Function function]
    (FunctionUtil/function function)))

