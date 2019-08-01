(ns org.nd4j.nativeblas.Nd4jCpu$float_extract_image_patches
  "extract_image_patches op - Extract patches from images and put them in the \"depth\" output dimension.
 input params:
 0 - images tensor (4D)
 int params:
 0 - ksize_rows
 1 - ksize_cols
 2 - strides_rows
 3 - strides_cols
 4 - rates_rows
 5 - rates_cols
 6 - padding_type - 0 - equiv 'VALID', 1 - 'SAME'"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCpu$float_extract_image_patches]))

(defn ->float-extract-image-patches
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$float_extract_image_patches [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$float_extract_image_patches p))
  (^Nd4jCpu$float_extract_image_patches []
    (new Nd4jCpu$float_extract_image_patches )))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCpu$float_extract_image_patches`"
  (^org.nd4j.nativeblas.Nd4jCpu$float_extract_image_patches [^Nd4jCpu$float_extract_image_patches this ^Long position]
    (-> this (.position position))))

(defn calculate-output-shape
  "Description copied from class: Nd4jCpu.FloatDeclarableOp

  input-shape - `org.nd4j.nativeblas.Nd4jCpu$ShapeList`
  block - `org.nd4j.nativeblas.Nd4jCpu$FloatContext`

  returns: `org.nd4j.nativeblas.Nd4jCpu$ShapeList`"
  (^org.nd4j.nativeblas.Nd4jCpu$ShapeList [^Nd4jCpu$float_extract_image_patches this ^org.nd4j.nativeblas.Nd4jCpu$ShapeList input-shape ^org.nd4j.nativeblas.Nd4jCpu$FloatContext block]
    (-> this (.calculateOutputShape input-shape block))))

