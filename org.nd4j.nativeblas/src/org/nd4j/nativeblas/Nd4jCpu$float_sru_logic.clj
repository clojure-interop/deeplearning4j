(ns org.nd4j.nativeblas.Nd4jCpu$float_sru_logic
  "Implementation of operation for Simple Recurrent Unit: \"Training RNNs as Fast as CNNs\" Tao Lei, Yu Zhang, Yoav Artzi
 Input arrays:
 0: input 3d tensor with shape [bS x K x N], N - number of time steps, bS - batch size, K - number of features
 1: 2d tensor of weights [3K x K]
 2: row of biases with twice length [1 × 2K]
 3: 2d tensor of previous cell state [bS x K]
 4: optional, 2d tensor of dropout mask [bS x K]
 Output arrays:
 0: 3d tensor of cell output [bS x K x N]
 1: 3d tensor of cell state [bS x K x N]"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCpu$float_sru_logic]))

(defn ->float-sru-logic
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$float_sru_logic [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$float_sru_logic p))
  (^Nd4jCpu$float_sru_logic []
    (new Nd4jCpu$float_sru_logic )))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCpu$float_sru_logic`"
  (^org.nd4j.nativeblas.Nd4jCpu$float_sru_logic [^Nd4jCpu$float_sru_logic this ^Long position]
    (-> this (.position position))))

(defn calculate-output-shape
  "Description copied from class: Nd4jCpu.FloatDeclarableOp

  input-shape - `org.nd4j.nativeblas.Nd4jCpu$ShapeList`
  block - `org.nd4j.nativeblas.Nd4jCpu$FloatContext`

  returns: `org.nd4j.nativeblas.Nd4jCpu$ShapeList`"
  (^org.nd4j.nativeblas.Nd4jCpu$ShapeList [^Nd4jCpu$float_sru_logic this ^org.nd4j.nativeblas.Nd4jCpu$ShapeList input-shape ^org.nd4j.nativeblas.Nd4jCpu$FloatContext block]
    (-> this (.calculateOutputShape input-shape block))))

