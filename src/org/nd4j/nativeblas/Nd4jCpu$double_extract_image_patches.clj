(ns org.nd4j.nativeblas.Nd4jCpu$double_extract_image_patches
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCpu$double_extract_image_patches]))

(defn ->double-extract-image-patches
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$double_extract_image_patches [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$double_extract_image_patches p))
  (^Nd4jCpu$double_extract_image_patches []
    (new Nd4jCpu$double_extract_image_patches )))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCpu$double_extract_image_patches`"
  (^org.nd4j.nativeblas.Nd4jCpu$double_extract_image_patches [^Nd4jCpu$double_extract_image_patches this ^Long position]
    (-> this (.position position))))

(defn calculate-output-shape
  "Description copied from class: Nd4jCpu.DoubleDeclarableOp

  input-shape - `org.nd4j.nativeblas.Nd4jCpu$ShapeList`
  block - `org.nd4j.nativeblas.Nd4jCpu$DoubleContext`

  returns: `org.nd4j.nativeblas.Nd4jCpu$ShapeList`"
  (^org.nd4j.nativeblas.Nd4jCpu$ShapeList [^Nd4jCpu$double_extract_image_patches this ^org.nd4j.nativeblas.Nd4jCpu$ShapeList input-shape ^org.nd4j.nativeblas.Nd4jCpu$DoubleContext block]
    (-> this (.calculateOutputShape input-shape block))))

