(ns org.nd4j.linalg.cpu.nativecpu.DirectShapeInfoProvider
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.cpu.nativecpu DirectShapeInfoProvider]))

(defn ->direct-shape-info-provider
  "Constructor."
  (^DirectShapeInfoProvider []
    (new DirectShapeInfoProvider )))

(defn create-shape-information
  "Description copied from class: BaseShapeInfoProvider

  shape - `int[]`
  stride - `int[]`
  offset - `long`
  element-wise-stride - `int`
  order - `char`
  extras - `long`

  returns: `org.nd4j.linalg.primitives.Pair<org.nd4j.linalg.api.buffer.DataBuffer,long[]>`"
  ([^DirectShapeInfoProvider this shape stride ^Long offset ^Integer element-wise-stride ^Character order ^Long extras]
    (-> this (.createShapeInformation shape stride offset element-wise-stride order extras)))
  ([^DirectShapeInfoProvider this shape stride ^Long offset ^Integer element-wise-stride ^Character order]
    (-> this (.createShapeInformation shape stride offset element-wise-stride order))))

(defn purge-cache
  "Description copied from interface: ShapeInfoProvider"
  ([^DirectShapeInfoProvider this]
    (-> this (.purgeCache))))

