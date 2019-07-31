(ns org.deeplearning4j.nn.layers.BaseCudnnHelper$TensorArray
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.layers BaseCudnnHelper$TensorArray]))

(defn ->tensor-array
  "Constructor.

  size - `long`"
  (^BaseCudnnHelper$TensorArray [^Long size]
    (new BaseCudnnHelper$TensorArray size))
  (^BaseCudnnHelper$TensorArray []
    (new BaseCudnnHelper$TensorArray )))

