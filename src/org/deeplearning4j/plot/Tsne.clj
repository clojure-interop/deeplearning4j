(ns org.deeplearning4j.plot.Tsne
  "dl4j port of original t-sne algorithm described/implemented by van der Maaten and Hinton"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.plot Tsne]))

(defn ->tsne
  "Constructor.

  max-iter - `int`
  real-min - `double`
  initial-momentum - `double`
  final-momentum - `double`
  min-gain - `double`
  momentum - `double`
  switch-momentum-iteration - `int`
  normalize - `boolean`
  use-pca - `boolean`
  stop-lying-iteration - `int`
  tolerance - `double`
  learning-rate - `double`
  use-ada-grad - `boolean`
  perplexity - `double`"
  (^Tsne [^Integer max-iter ^Double real-min ^Double initial-momentum ^Double final-momentum ^Double min-gain ^Double momentum ^Integer switch-momentum-iteration ^Boolean normalize ^Boolean use-pca ^Integer stop-lying-iteration ^Double tolerance ^Double learning-rate ^Boolean use-ada-grad ^Double perplexity]
    (new Tsne max-iter real-min initial-momentum final-momentum min-gain momentum switch-momentum-iteration normalize use-pca stop-lying-iteration tolerance learning-rate use-ada-grad perplexity)))

(defn calculate
  "x - `org.nd4j.linalg.api.ndarray.INDArray`
  target-dimensions - `int`
  perplexity - `double`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^Tsne this ^org.nd4j.linalg.api.ndarray.INDArray x ^Integer target-dimensions ^Double perplexity]
    (-> this (.calculate x target-dimensions perplexity))))

(defn diag
  "ds - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^Tsne this ^org.nd4j.linalg.api.ndarray.INDArray ds]
    (-> this (.diag ds))))

(defn plot
  "matrix - `org.nd4j.linalg.api.ndarray.INDArray`
  n-dims - `int`
  labels - `java.util.List`
  path - `java.lang.String`

  throws: java.io.IOException"
  ([^Tsne this ^org.nd4j.linalg.api.ndarray.INDArray matrix ^Integer n-dims ^java.util.List labels ^java.lang.String path]
    (-> this (.plot matrix n-dims labels path))))

(defn h-beta
  "Computes a gaussian kernel
  given a vector of squared distance distances

  d - the data - `org.nd4j.linalg.api.ndarray.INDArray`
  beta - `double`

  returns: `org.nd4j.linalg.primitives.Pair<java.lang.Double,org.nd4j.linalg.api.ndarray.INDArray>`"
  (^org.nd4j.linalg.primitives.Pair [^Tsne this ^org.nd4j.linalg.api.ndarray.INDArray d ^Double beta]
    (-> this (.hBeta d beta))))

