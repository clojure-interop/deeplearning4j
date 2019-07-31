(ns org.deeplearning4j.rl4j.learning.sync.Transition
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.rl4j.learning.sync Transition]))

(defn ->transition
  "Constructor."
  (^Transition []
    (new Transition )))

(defn *concat
  "concat an array history into a single INDArry of as many channel
  as element in the history array

  history - the history to concat - `org.nd4j.linalg.api.ndarray.INDArray[]`

  returns: the multi-channel INDArray - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [history]
    (Transition/concat history)))

(defn *dup
  "Duplicate an history

  history - the history to duplicate - `org.nd4j.linalg.api.ndarray.INDArray[]`

  returns: a duplicate of the history - `org.nd4j.linalg.api.ndarray.INDArray[]`"
  ([history]
    (Transition/dup history)))

(defn *append
  "append a pixel frame to an history (throwing the last frame)

  history - the history on which to append - `org.nd4j.linalg.api.ndarray.INDArray[]`
  append - the pixel frame to append - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: the appended history - `org.nd4j.linalg.api.ndarray.INDArray[]`"
  ([history ^org.nd4j.linalg.api.ndarray.INDArray append]
    (Transition/append history append)))

(defn dup
  "Duplicate this transition

  returns: this transition duplicated - `org.deeplearning4j.rl4j.learning.sync.Transition<A>`"
  (^org.deeplearning4j.rl4j.learning.sync.Transition [^Transition this]
    (-> this (.dup))))

