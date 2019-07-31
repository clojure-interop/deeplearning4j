(ns org.deeplearning4j.text.movingwindow.WindowConverter
  "Util methods for converting windows to
 training examples"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.text.movingwindow WindowConverter]))

(defn *as-example-array
  "Converts a window (each word in the window)
  in to a vector.
  Keep in mind each window is a multi word context.
  From there, each word uses the passed in model
  as a lookup table to get what vectors are relevant
  to the passed in windows

  window - the window to take in. - `org.deeplearning4j.text.movingwindow.Window`
  vec - the model to use as a lookup table - `org.deeplearning4j.models.word2vec.Word2Vec`
  normalize - `boolean`

  returns: a concacneated 1 row array
  containing all of the numbers for each word in the window - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^org.deeplearning4j.text.movingwindow.Window window ^org.deeplearning4j.models.word2vec.Word2Vec vec ^Boolean normalize]
    (WindowConverter/asExampleArray window vec normalize)))

(defn *as-example-matrix
  "Converts a window (each word in the window)
  in to a vector.
  Keep in mind each window is a multi word context.
  From there, each word uses the passed in model
  as a lookup table to get what vectors are relevant
  to the passed in windows

  window - the window to take in. - `org.deeplearning4j.text.movingwindow.Window`
  vec - the model to use as a lookup table - `org.deeplearning4j.models.word2vec.Word2Vec`

  returns: a concatneated 1 row array
  containing all of the numbers for each word in the window - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^org.deeplearning4j.text.movingwindow.Window window ^org.deeplearning4j.models.word2vec.Word2Vec vec]
    (WindowConverter/asExampleMatrix window vec)))

