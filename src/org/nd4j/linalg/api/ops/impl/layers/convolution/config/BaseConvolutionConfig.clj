(ns org.nd4j.linalg.api.ops.impl.layers.convolution.config.BaseConvolutionConfig
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops.impl.layers.convolution.config BaseConvolutionConfig]))

(defn ->base-convolution-config
  "Constructor."
  (^BaseConvolutionConfig []
    (new BaseConvolutionConfig )))

(defn get-value
  "Get the value for a given property
  for this function

  property - the property to get - `java.lang.reflect.Field`

  returns: the value for the function if it exists - `java.lang.Object`"
  (^java.lang.Object [^BaseConvolutionConfig this ^java.lang.reflect.Field property]
    (-> this (.getValue property))))

(defn set-value-for
  "Set the value for this function.
  Note that if value is null an ND4JIllegalStateException
  will be thrown.

  target - the target field - `java.lang.reflect.Field`
  value - the value to set - `java.lang.Object`"
  ([^BaseConvolutionConfig this ^java.lang.reflect.Field target ^java.lang.Object value]
    (-> this (.setValueFor target value))))

