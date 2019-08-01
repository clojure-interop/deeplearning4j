(ns org.nd4j.nativeblas.Nd4jCpu$float_sru_bi
  "Implementation of operation for Simple Recurrent Unit (bidirectional case): \"Training RNNs as Fast as CNNs\" Tao Lei, Yu Zhang, Yoav Artzi
 Input arrays:
 0: input 3d tensor with shape [N x bS x 2K], N - number of time steps, bS - batch size, K - number of features
 1: 2d tensor of weights [2K x 6K]
 2: row of biases with twice length [1 × 4K]
 3: 2d tensor of previous cell state [bS x 2K]
 4: optional, 2d tensor of dropout mask [bS x 2K]
 Output arrays:
 0: 3d tensor of cell output [N x bS x 2K]
 1: 3d tensor of cell state [N x bS x 2K]"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCpu$float_sru_bi]))

(defn ->float-sru-bi
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$float_sru_bi [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$float_sru_bi p))
  (^Nd4jCpu$float_sru_bi []
    (new Nd4jCpu$float_sru_bi )))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCpu$float_sru_bi`"
  (^org.nd4j.nativeblas.Nd4jCpu$float_sru_bi [^Nd4jCpu$float_sru_bi this ^Long position]
    (-> this (.position position))))

(defn calculate-output-shape
  "Description copied from class: Nd4jCpu.FloatDeclarableOp

  input-shape - `org.nd4j.nativeblas.Nd4jCpu$ShapeList`
  block - `org.nd4j.nativeblas.Nd4jCpu$FloatContext`

  returns: `org.nd4j.nativeblas.Nd4jCpu$ShapeList`"
  (^org.nd4j.nativeblas.Nd4jCpu$ShapeList [^Nd4jCpu$float_sru_bi this ^org.nd4j.nativeblas.Nd4jCpu$ShapeList input-shape ^org.nd4j.nativeblas.Nd4jCpu$FloatContext block]
    (-> this (.calculateOutputShape input-shape block))))

