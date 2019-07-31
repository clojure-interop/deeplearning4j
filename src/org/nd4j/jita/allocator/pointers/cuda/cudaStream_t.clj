(ns org.nd4j.jita.allocator.pointers.cuda.cudaStream_t
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.jita.allocator.pointers.cuda cudaStream_t]))

(defn ->cuda-stream-t
  "Constructor.

  pointer - `org.bytedeco.javacpp.Pointer`"
  (^cudaStream_t [^org.bytedeco.javacpp.Pointer pointer]
    (new cudaStream_t pointer)))

(defn synchronize
  "returns: `int`"
  (^Integer [^cudaStream_t this]
    (-> this (.synchronize))))

