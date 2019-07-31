(ns org.deeplearning4j.nn.gradient.Gradient
  "Generic gradient"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.gradient Gradient]))

(defn gradient-for-variable
  "Gradient look up table

  returns: the gradient look up table - `java.util.Map<java.lang.String,org.nd4j.linalg.api.ndarray.INDArray>`"
  (^java.util.Map [^Gradient this]
    (-> this (.gradientForVariable))))

(defn gradient
  "The full gradient as one flat vector

  order - `java.util.List`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^Gradient this ^java.util.List order]
    (-> this (.gradient order)))
  (^org.nd4j.linalg.api.ndarray.INDArray [^Gradient this]
    (-> this (.gradient))))

(defn clear
  "Clear residual parameters (useful for returning a gradient and then clearing old objects)"
  ([^Gradient this]
    (-> this (.clear))))

(defn get-gradient-for
  "The gradient for the given variable

  variable - the variable to get the gradient for - `java.lang.String`

  returns: the gradient for the given variable or null - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^Gradient this ^java.lang.String variable]
    (-> this (.getGradientFor variable))))

(defn set-gradient-for
  "Update gradient for the given variable; also (optionally) specify the order in which the array should be flattened
  to a row vector

  variable - the variable to get the gradient for - `java.lang.String`
  gradient - the gradient values - `org.nd4j.linalg.api.ndarray.INDArray`
  flattening-order - the order in which gradients should be flattened (null ok - default) - `java.lang.Character`

  returns: the gradient for the given variable or null - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^Gradient this ^java.lang.String variable ^org.nd4j.linalg.api.ndarray.INDArray gradient ^java.lang.Character flattening-order]
    (-> this (.setGradientFor variable gradient flattening-order)))
  (^org.nd4j.linalg.api.ndarray.INDArray [^Gradient this ^java.lang.String variable ^org.nd4j.linalg.api.ndarray.INDArray gradient]
    (-> this (.setGradientFor variable gradient))))

(defn flattening-order-for-variable
  "Return the gradient flattening order for the specified variable, or null if it is not explicitly set

  variable - Variable to return the gradient flattening order for - `java.lang.String`

  returns: Order in which the specified variable's gradient should be flattened - `java.lang.Character`"
  (^java.lang.Character [^Gradient this ^java.lang.String variable]
    (-> this (.flatteningOrderForVariable variable))))

