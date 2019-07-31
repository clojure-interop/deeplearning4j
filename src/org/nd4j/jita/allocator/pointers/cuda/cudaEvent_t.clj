(ns org.nd4j.jita.allocator.pointers.cuda.cudaEvent_t
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.jita.allocator.pointers.cuda cudaEvent_t]))

(defn ->cuda-event-t
  "Constructor.

  pointer - `org.bytedeco.javacpp.Pointer`"
  (^cudaEvent_t [^org.bytedeco.javacpp.Pointer pointer]
    (new cudaEvent_t pointer)))

(defn destroyed?
  "returns: `boolean`"
  (^Boolean [^cudaEvent_t this]
    (-> this (.isDestroyed))))

(defn mark-destoryed
  ""
  ([^cudaEvent_t this]
    (-> this (.markDestoryed))))

(defn destroy
  ""
  ([^cudaEvent_t this]
    (-> this (.destroy))))

(defn synchronize
  ""
  ([^cudaEvent_t this]
    (-> this (.synchronize))))

(defn register
  "stream - `org.nd4j.jita.allocator.pointers.cuda.cudaStream_t`"
  ([^cudaEvent_t this ^org.nd4j.jita.allocator.pointers.cuda.cudaStream_t stream]
    (-> this (.register stream))))

