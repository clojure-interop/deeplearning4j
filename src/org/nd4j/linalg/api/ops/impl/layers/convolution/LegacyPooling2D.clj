(ns org.nd4j.linalg.api.ops.impl.layers.convolution.LegacyPooling2D
  "Deprecated.
 Note: This operation will be removed in a future release"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops.impl.layers.convolution LegacyPooling2D]))

(defn ->legacy-pooling-2-d
  "Constructor.

  Deprecated.

  x - `org.nd4j.linalg.api.ndarray.INDArray`
  kh - `int`
  kw - `int`
  sy - `int`
  sx - `int`
  ph - `int`
  pw - `int`
  dh - `int`
  dw - `int`
  is-same-mode - `boolean`
  type - `org.nd4j.linalg.api.ops.impl.layers.convolution.LegacyPooling2D$Pooling2DType`
  extra - `double`
  z - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^LegacyPooling2D [^org.nd4j.linalg.api.ndarray.INDArray x ^Integer kh ^Integer kw ^Integer sy ^Integer sx ^Integer ph ^Integer pw ^Integer dh ^Integer dw ^Boolean is-same-mode ^org.nd4j.linalg.api.ops.impl.layers.convolution.LegacyPooling2D$Pooling2DType type ^Double extra ^org.nd4j.linalg.api.ndarray.INDArray z]
    (new LegacyPooling2D x kh kw sy sx ph pw dh dw is-same-mode type extra z))
  (^LegacyPooling2D []
    (new LegacyPooling2D )))

(defn exec-special?
  "Deprecated.

  returns: true if the executioner needs to do a special
  call or not false otherwise - `boolean`"
  (^Boolean [^LegacyPooling2D this]
    (-> this (.isExecSpecial))))

(defn op-num
  "Deprecated.

  returns: `int`"
  (^Integer [^LegacyPooling2D this]
    (-> this (.opNum))))

(defn op-name
  "Deprecated.

  returns: the opName of this operation - `java.lang.String`"
  (^java.lang.String [^LegacyPooling2D this]
    (-> this (.opName))))

(defn extra-args
  "Deprecated.

  returns: the extra arguments - `java.lang.Object[]`"
  ([^LegacyPooling2D this]
    (-> this (.extraArgs))))

(defn onnx-name
  "Deprecated.

  returns: `java.lang.String`"
  (^java.lang.String [^LegacyPooling2D this]
    (-> this (.onnxName))))

(defn tensorflow-name
  "Deprecated.

  returns: `java.lang.String`"
  (^java.lang.String [^LegacyPooling2D this]
    (-> this (.tensorflowName))))

(defn do-diff
  "Deprecated.

  f-1 - `java.util.List`

  returns: `java.util.List<org.nd4j.autodiff.samediff.SDVariable>`"
  (^java.util.List [^LegacyPooling2D this ^java.util.List f-1]
    (-> this (.doDiff f-1))))

