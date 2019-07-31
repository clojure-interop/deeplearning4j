(ns org.nd4j.jita.allocator.pointers.CudaPointer
  "This class is simple logic-less holder for pointers derived from CUDA.
 PLEASE NOTE:
 1. All pointers are blind, and do NOT care about length/capacity/offsets/strides whatever
 2. They are really blind. Even data opType is unknown."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.jita.allocator.pointers CudaPointer]))

(defn ->cuda-pointer
  "Constructor.

  pointer - `org.bytedeco.javacpp.Pointer`
  capacity - `long`
  byte-offset - `long`"
  (^CudaPointer [^org.bytedeco.javacpp.Pointer pointer ^Long capacity ^Long byte-offset]
    (new CudaPointer pointer capacity byte-offset))
  (^CudaPointer [^org.bytedeco.javacpp.Pointer pointer ^Long capacity]
    (new CudaPointer pointer capacity))
  (^CudaPointer [^org.bytedeco.javacpp.Pointer pointer]
    (new CudaPointer pointer)))

(defn as-native-pointer
  "returns: `org.bytedeco.javacpp.Pointer`"
  (^org.bytedeco.javacpp.Pointer [^CudaPointer this]
    (-> this (.asNativePointer))))

(defn as-float-pointer
  "returns: `org.bytedeco.javacpp.FloatPointer`"
  (^org.bytedeco.javacpp.FloatPointer [^CudaPointer this]
    (-> this (.asFloatPointer))))

(defn as-long-pointer
  "returns: `org.bytedeco.javacpp.LongPointer`"
  (^org.bytedeco.javacpp.LongPointer [^CudaPointer this]
    (-> this (.asLongPointer))))

(defn as-double-pointer
  "returns: `org.bytedeco.javacpp.DoublePointer`"
  (^org.bytedeco.javacpp.DoublePointer [^CudaPointer this]
    (-> this (.asDoublePointer))))

(defn as-int-pointer
  "returns: `org.bytedeco.javacpp.IntPointer`"
  (^org.bytedeco.javacpp.IntPointer [^CudaPointer this]
    (-> this (.asIntPointer))))

(defn as-short-pointer
  "returns: `org.bytedeco.javacpp.ShortPointer`"
  (^org.bytedeco.javacpp.ShortPointer [^CudaPointer this]
    (-> this (.asShortPointer))))

(defn get-native-pointer
  "returns: `long`"
  (^Long [^CudaPointer this]
    (-> this (.getNativePointer))))

(defn sizeof
  "Returns 1 for Pointer or BytePointer else Loader.sizeof(getClass()) or -1 on error.

  returns: `int`"
  (^Integer [^CudaPointer this]
    (-> this (.sizeof))))

