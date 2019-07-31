(ns org.nd4j.jita.constant.ProtectedCudaShapeInfoProvider
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.jita.constant ProtectedCudaShapeInfoProvider]))

(defn *get-instance
  "returns: `org.nd4j.jita.constant.ProtectedCudaShapeInfoProvider`"
  (^org.nd4j.jita.constant.ProtectedCudaShapeInfoProvider []
    (ProtectedCudaShapeInfoProvider/getInstance )))

(defn purge-cache
  "This method forces cache purge, if cache is available for specific implementation"
  ([^ProtectedCudaShapeInfoProvider this]
    (-> this (.purgeCache))))

(defn create-shape-information
  "Description copied from class: BaseShapeInfoProvider

  shape - `int[]`
  stride - `int[]`
  offset - `long`
  element-wise-stride - `int`
  order - `char`
  extras - `long`

  returns: `org.nd4j.linalg.primitives.Pair<org.nd4j.linalg.api.buffer.DataBuffer,long[]>`"
  ([^ProtectedCudaShapeInfoProvider this shape stride ^Long offset ^Integer element-wise-stride ^Character order ^Long extras]
    (-> this (.createShapeInformation shape stride offset element-wise-stride order extras)))
  ([^ProtectedCudaShapeInfoProvider this shape stride ^Long offset ^Integer element-wise-stride ^Character order]
    (-> this (.createShapeInformation shape stride offset element-wise-stride order))))

