(ns org.deeplearning4j.nn.layers.BaseCudnnHelper$CudnnContext$Deallocator
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.layers BaseCudnnHelper$CudnnContext$Deallocator]))

(defn deallocate
  ""
  ([^BaseCudnnHelper$CudnnContext$Deallocator this]
    (-> this (.deallocate))))

