(ns org.nd4j.linalg.jcublas.CachedShapeInfoProvider
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.jcublas CachedShapeInfoProvider]))

(defn ->cached-shape-info-provider
  "Constructor."
  (^CachedShapeInfoProvider []
    (new CachedShapeInfoProvider )))

(defn create-shape-information
  "Description copied from interface: ShapeInfoProvider

  shape - `long[]`
  stride - `long[]`
  offset - `long`
  element-wise-stride - `long`
  order - `char`
  extras - `long`

  returns: `org.nd4j.linalg.primitives.Pair<org.nd4j.linalg.api.buffer.DataBuffer,long[]>`"
  ([^CachedShapeInfoProvider this shape stride ^Long offset ^Long element-wise-stride ^Character order ^Long extras]
    (-> this (.createShapeInformation shape stride offset element-wise-stride order extras)))
  ([^CachedShapeInfoProvider this shape stride ^Long offset ^Long element-wise-stride ^Character order]
    (-> this (.createShapeInformation shape stride offset element-wise-stride order))))

(defn purge-cache
  "This method forces cache purge, if cache is available for specific implementation"
  ([^CachedShapeInfoProvider this]
    (-> this (.purgeCache))))

