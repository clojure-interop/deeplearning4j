(ns org.deeplearning4j.nn.layers.BaseCudnnHelper$CudnnContext
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.layers BaseCudnnHelper$CudnnContext]))

(defn ->cudnn-context
  "Constructor.

  c - `org.deeplearning4j.nn.layers.BaseCudnnHelper$CudnnContext`"
  (^BaseCudnnHelper$CudnnContext [^org.deeplearning4j.nn.layers.BaseCudnnHelper$CudnnContext c]
    (new BaseCudnnHelper$CudnnContext c))
  (^BaseCudnnHelper$CudnnContext []
    (new BaseCudnnHelper$CudnnContext )))

