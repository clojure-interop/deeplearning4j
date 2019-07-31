(ns org.nd4j.linalg.api.ops.impl.shape.bp.TileBp
  "Tile backprop function"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops.impl.shape.bp TileBp]))

(defn ->tile-bp
  "Constructor.

  same-diff - `org.nd4j.autodiff.samediff.SameDiff`
  in - `org.nd4j.autodiff.samediff.SDVariable`
  grad - `org.nd4j.autodiff.samediff.SDVariable`
  repeat - `int[]`"
  (^TileBp [^org.nd4j.autodiff.samediff.SameDiff same-diff ^org.nd4j.autodiff.samediff.SDVariable in ^org.nd4j.autodiff.samediff.SDVariable grad repeat]
    (new TileBp same-diff in grad repeat))
  (^TileBp []
    (new TileBp )))

(defn op-name
  "Description copied from class: DynamicCustomOp

  returns: `java.lang.String`"
  (^java.lang.String [^TileBp this]
    (-> this (.opName))))

(defn do-diff
  "Description copied from class: DifferentialFunction

  i-v - `java.util.List`

  returns: `java.util.List<org.nd4j.autodiff.samediff.SDVariable>`"
  (^java.util.List [^TileBp this ^java.util.List i-v]
    (-> this (.doDiff i-v))))

