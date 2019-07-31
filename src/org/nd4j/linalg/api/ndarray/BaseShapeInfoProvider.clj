(ns org.nd4j.linalg.api.ndarray.BaseShapeInfoProvider
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ndarray BaseShapeInfoProvider]))

(defn ->base-shape-info-provider
  "Constructor."
  (^BaseShapeInfoProvider []
    (new BaseShapeInfoProvider )))

(defn create-shape-information
  "This method creates shapeInformation buffer, based on detailed shape information being passed in

  shape - `int[]`
  stride - `int[]`
  offset - `long`
  element-wise-stride - `int`
  order - `char`
  extras - `long`

  returns: `org.nd4j.linalg.primitives.Pair<org.nd4j.linalg.api.buffer.DataBuffer,long[]>`"
  ([^BaseShapeInfoProvider this shape stride ^Long offset ^Integer element-wise-stride ^Character order ^Long extras]
    (-> this (.createShapeInformation shape stride offset element-wise-stride order extras)))
  ([^BaseShapeInfoProvider this shape stride ^Long offset ^Integer element-wise-stride ^Character order]
    (-> this (.createShapeInformation shape stride offset element-wise-stride order)))
  ([^BaseShapeInfoProvider this shape ^Character order]
    (-> this (.createShapeInformation shape order)))
  ([^BaseShapeInfoProvider this shape]
    (-> this (.createShapeInformation shape))))

(defn get-cached-bytes
  "Description copied from interface: ShapeInfoProvider

  returns: `long`"
  (^Long [^BaseShapeInfoProvider this]
    (-> this (.getCachedBytes))))

