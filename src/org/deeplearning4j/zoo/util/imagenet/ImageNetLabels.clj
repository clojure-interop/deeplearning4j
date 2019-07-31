(ns org.deeplearning4j.zoo.util.imagenet.ImageNetLabels
  "Helper class with a static method that returns the label description."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.zoo.util.imagenet ImageNetLabels]))

(defn ->image-net-labels
  "Constructor.

  throws: java.io.IOException"
  (^ImageNetLabels []
    (new ImageNetLabels )))

(defn get-label
  "Returns the description of tne nth class in the 1000 classes of ImageNet.

  n - `int`

  returns: `java.lang.String`"
  (^java.lang.String [^ImageNetLabels this ^Integer n]
    (-> this (.getLabel n))))

(defn decode-predictions
  "Given predictions from the trained model this method will return a string
  listing the top five matches and the respective probabilities

  predictions - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: `java.lang.String`"
  (^java.lang.String [^ImageNetLabels this ^org.nd4j.linalg.api.ndarray.INDArray predictions]
    (-> this (.decodePredictions predictions))))

