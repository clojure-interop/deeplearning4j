(ns org.deeplearning4j.ui.api.Route
  "A Route specifies an endpoint that can be queried in the UI - along with how it should be handled"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.ui.api Route]))

(defn ->route
  "Constructor.

  route - `java.lang.String`
  method - `org.deeplearning4j.ui.api.HttpMethod`
  function-type - `org.deeplearning4j.ui.api.FunctionType`
  supplier - `java.util.function.Supplier`"
  (^Route [^java.lang.String route ^org.deeplearning4j.ui.api.HttpMethod method ^org.deeplearning4j.ui.api.FunctionType function-type ^java.util.function.Supplier supplier]
    (new Route route method function-type supplier)))

