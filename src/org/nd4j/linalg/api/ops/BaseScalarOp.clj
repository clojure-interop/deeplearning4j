(ns org.nd4j.linalg.api.ops.BaseScalarOp
  "Base scalar operation"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops BaseScalarOp]))

(defn ->base-scalar-op
  "Constructor.

  x - `org.nd4j.linalg.api.ndarray.INDArray`
  y - `org.nd4j.linalg.api.ndarray.INDArray`
  z - `org.nd4j.linalg.api.ndarray.INDArray`
  n - `long`
  num - `java.lang.Number`"
  (^BaseScalarOp [^org.nd4j.linalg.api.ndarray.INDArray x ^org.nd4j.linalg.api.ndarray.INDArray y ^org.nd4j.linalg.api.ndarray.INDArray z ^Long n ^java.lang.Number num]
    (new BaseScalarOp x y z n num))
  (^BaseScalarOp [^org.nd4j.autodiff.samediff.SameDiff same-diff ^org.nd4j.autodiff.samediff.SDVariable i-v ^java.lang.Number scalar ^Boolean in-place]
    (new BaseScalarOp same-diff i-v scalar in-place))
  (^BaseScalarOp [^org.nd4j.autodiff.samediff.SameDiff same-diff ^org.nd4j.autodiff.samediff.SDVariable i-v ^java.lang.Number scalar]
    (new BaseScalarOp same-diff i-v scalar))
  (^BaseScalarOp [^org.nd4j.linalg.api.ndarray.INDArray x ^java.lang.Number num]
    (new BaseScalarOp x num))
  (^BaseScalarOp []
    (new BaseScalarOp )))

(defn z
  "Description copied from interface: Op

  returns: the resulting ndarray - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseScalarOp this]
    (-> this (.z))))

(defn calculate-output-shape
  "Description copied from class: DifferentialFunction

  returns: `java.util.List<long[]>`"
  ([^BaseScalarOp this]
    (-> this (.calculateOutputShape))))

(defn op-type
  "Description copied from class: DifferentialFunction

  returns: `org.nd4j.linalg.api.ops.Op$Type`"
  (^org.nd4j.linalg.api.ops.Op$Type [^BaseScalarOp this]
    (-> this (.opType))))

(defn set-scalar
  "scalar - `java.lang.Number`"
  ([^BaseScalarOp this ^java.lang.Number scalar]
    (-> this (.setScalar scalar))))

(defn scalar
  "Description copied from interface: ScalarOp

  returns: the scalar - `java.lang.Number`"
  (^java.lang.Number [^BaseScalarOp this]
    (-> this (.scalar))))

(defn get-dimension
  "Description copied from interface: BroadcastOp

  returns: `int[]`"
  ([^BaseScalarOp this]
    (-> this (.getDimension))))

(defn set-dimension
  "Description copied from interface: BroadcastOp

  dimension - `int`"
  ([^BaseScalarOp this ^Integer dimension]
    (-> this (.setDimension dimension))))

