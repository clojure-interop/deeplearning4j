(ns org.nd4j.linalg.api.ndarray.ShapeInfoProvider
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ndarray ShapeInfoProvider]))

(defn create-shape-information
  "This method creates shapeInformation buffer, based on detailed shape information being passed in

  shape - `int[]`
  stride - `int[]`
  offset - `long`
  element-wise-stride - `int`
  order - `char`
  extras - `long`

  returns: `org.nd4j.linalg.primitives.Pair<org.nd4j.linalg.api.buffer.DataBuffer,long[]>`"
  ([^ShapeInfoProvider this shape stride ^Long offset ^Integer element-wise-stride ^Character order ^Long extras]
    (-> this (.createShapeInformation shape stride offset element-wise-stride order extras)))
  ([^ShapeInfoProvider this shape stride ^Long offset ^Integer element-wise-stride ^Character order]
    (-> this (.createShapeInformation shape stride offset element-wise-stride order)))
  ([^ShapeInfoProvider this shape ^Character order]
    (-> this (.createShapeInformation shape order)))
  ([^ShapeInfoProvider this shape]
    (-> this (.createShapeInformation shape))))

(defn purge-cache
  "This method forces cache purge, if cache is available for specific implementation"
  ([^ShapeInfoProvider this]
    (-> this (.purgeCache))))

(defn get-cached-bytes
  "This method returns memory used for cache, in bytes

  returns: `long`"
  (^Long [^ShapeInfoProvider this]
    (-> this (.getCachedBytes))))

