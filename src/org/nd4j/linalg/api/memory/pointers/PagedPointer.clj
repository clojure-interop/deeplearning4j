(ns org.nd4j.linalg.api.memory.pointers.PagedPointer
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.memory.pointers PagedPointer]))

(defn ->paged-pointer
  "Constructor.

  pointer - `org.bytedeco.javacpp.Pointer`
  capacity - `long`
  offset - `long`"
  (^PagedPointer [^org.bytedeco.javacpp.Pointer pointer ^Long capacity ^Long offset]
    (new PagedPointer pointer capacity offset))
  (^PagedPointer [^org.bytedeco.javacpp.Pointer pointer ^Long capacity]
    (new PagedPointer pointer capacity))
  (^PagedPointer [^Long address]
    (new PagedPointer address)))

(defn with-offset
  "offset - `long`
  capacity - `long`

  returns: `org.nd4j.linalg.api.memory.pointers.PagedPointer`"
  (^org.nd4j.linalg.api.memory.pointers.PagedPointer [^PagedPointer this ^Long offset ^Long capacity]
    (-> this (.withOffset offset capacity))))

(defn as-float-pointer
  "returns: `org.bytedeco.javacpp.FloatPointer`"
  (^org.bytedeco.javacpp.FloatPointer [^PagedPointer this]
    (-> this (.asFloatPointer))))

(defn as-double-pointer
  "returns: `org.bytedeco.javacpp.DoublePointer`"
  (^org.bytedeco.javacpp.DoublePointer [^PagedPointer this]
    (-> this (.asDoublePointer))))

(defn as-int-pointer
  "returns: `org.bytedeco.javacpp.IntPointer`"
  (^org.bytedeco.javacpp.IntPointer [^PagedPointer this]
    (-> this (.asIntPointer))))

(defn as-long-pointer
  "returns: `org.bytedeco.javacpp.LongPointer`"
  (^org.bytedeco.javacpp.LongPointer [^PagedPointer this]
    (-> this (.asLongPointer))))

(defn as-byte-pointer
  "returns: `org.bytedeco.javacpp.BytePointer`"
  (^org.bytedeco.javacpp.BytePointer [^PagedPointer this]
    (-> this (.asBytePointer))))

(defn deallocate
  "deallocate - `boolean`"
  ([^PagedPointer this ^Boolean deallocate]
    (-> this (.deallocate deallocate)))
  ([^PagedPointer this]
    (-> this (.deallocate))))

