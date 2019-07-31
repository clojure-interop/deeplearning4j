(ns org.deeplearning4j.nn.gradient.DefaultGradient
  "Default gradient implementation. Basically lookup table
 for ndarrays"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.gradient DefaultGradient]))

(defn ->default-gradient
  "Constructor.

  flattened-gradient - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^DefaultGradient [^org.nd4j.linalg.api.ndarray.INDArray flattened-gradient]
    (new DefaultGradient flattened-gradient))
  (^DefaultGradient []
    (new DefaultGradient )))

(def *-default-flattening-order
  "Static Constant.

  type: char"
  DefaultGradient/DEFAULT_FLATTENING_ORDER)

(defn gradient-for-variable
  "Description copied from interface: Gradient

  returns: the gradient look up table - `java.util.Map<java.lang.String,org.nd4j.linalg.api.ndarray.INDArray>`"
  (^java.util.Map [^DefaultGradient this]
    (-> this (.gradientForVariable))))

(defn gradient
  "Description copied from interface: Gradient

  order - `java.util.List`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^DefaultGradient this ^java.util.List order]
    (-> this (.gradient order)))
  (^org.nd4j.linalg.api.ndarray.INDArray [^DefaultGradient this]
    (-> this (.gradient))))

(defn clear
  "Description copied from interface: Gradient"
  ([^DefaultGradient this]
    (-> this (.clear))))

(defn get-gradient-for
  "Description copied from interface: Gradient

  variable - the variable to get the gradient for - `java.lang.String`

  returns: the gradient for the given variable or null - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^DefaultGradient this ^java.lang.String variable]
    (-> this (.getGradientFor variable))))

(defn set-gradient-for
  "Description copied from interface: Gradient

  variable - the variable to get the gradient for - `java.lang.String`
  gradient - the gradient values - `org.nd4j.linalg.api.ndarray.INDArray`
  flattening-order - the order in which gradients should be flattened (null ok - default) - `java.lang.Character`

  returns: the gradient for the given variable or null - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^DefaultGradient this ^java.lang.String variable ^org.nd4j.linalg.api.ndarray.INDArray gradient ^java.lang.Character flattening-order]
    (-> this (.setGradientFor variable gradient flattening-order)))
  (^org.nd4j.linalg.api.ndarray.INDArray [^DefaultGradient this ^java.lang.String variable ^org.nd4j.linalg.api.ndarray.INDArray new-gradient]
    (-> this (.setGradientFor variable new-gradient))))

(defn flattening-order-for-variable
  "Description copied from interface: Gradient

  variable - Variable to return the gradient flattening order for - `java.lang.String`

  returns: Order in which the specified variable's gradient should be flattened - `java.lang.Character`"
  (^java.lang.Character [^DefaultGradient this ^java.lang.String variable]
    (-> this (.flatteningOrderForVariable variable))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^DefaultGradient this]
    (-> this (.toString))))

