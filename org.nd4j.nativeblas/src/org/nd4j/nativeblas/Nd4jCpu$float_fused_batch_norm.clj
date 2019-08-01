(ns org.nd4j.nativeblas.Nd4jCpu$float_fused_batch_norm
  "This operation performs batch normalization of layer, it is based on following article http://arxiv.org/abs/1502.03167.
 Expected arguments:
 x: input 4D array of shape [bS,iH,iW,iD] (data format = NHWC) or [bS,iD,iH,iW] (data format = NCHW), where
 bS - batch size
 iH - input height
 iW - input width
 iD - input depth (or number of channels)
 scale: 1D input array of scale factors, shape [iD]
 offset: 1D input array of offsets (shifts), shape [iD]
 mean: 1D input array of population mean used for inference, shape [iD], this array is required only if isTraining = false
 variance: 1D input array of population mean used for inference, shape [iD], this array is required only if isTraining = false
 T input arguments:
 0: epsilon, it is optional argument, default value is 0.001, this is small number to be added to the variance of x
 integer input arguments:
 0: dataFormat, may have two values: zero -> NHWC, unity -> NCHW
 1: isTraining, may have two values: zero -> inference, unity -> training"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCpu$float_fused_batch_norm]))

(defn ->float-fused-batch-norm
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$float_fused_batch_norm [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$float_fused_batch_norm p))
  (^Nd4jCpu$float_fused_batch_norm []
    (new Nd4jCpu$float_fused_batch_norm )))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCpu$float_fused_batch_norm`"
  (^org.nd4j.nativeblas.Nd4jCpu$float_fused_batch_norm [^Nd4jCpu$float_fused_batch_norm this ^Long position]
    (-> this (.position position))))

(defn calculate-output-shape
  "Description copied from class: Nd4jCpu.FloatDeclarableOp

  input-shape - `org.nd4j.nativeblas.Nd4jCpu$ShapeList`
  block - `org.nd4j.nativeblas.Nd4jCpu$FloatContext`

  returns: `org.nd4j.nativeblas.Nd4jCpu$ShapeList`"
  (^org.nd4j.nativeblas.Nd4jCpu$ShapeList [^Nd4jCpu$float_fused_batch_norm this ^org.nd4j.nativeblas.Nd4jCpu$ShapeList input-shape ^org.nd4j.nativeblas.Nd4jCpu$FloatContext block]
    (-> this (.calculateOutputShape input-shape block))))

