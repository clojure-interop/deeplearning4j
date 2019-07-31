(ns org.nd4j.jita.allocator.pointers.cuda.cublasHandle_t
  "Created by raver119 on 19.04.16."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.jita.allocator.pointers.cuda cublasHandle_t]))

(defn ->cublas-handle-t
  "Constructor.

  pointer - `org.bytedeco.javacpp.Pointer`"
  (^cublasHandle_t [^org.bytedeco.javacpp.Pointer pointer]
    (new cublasHandle_t pointer)))

