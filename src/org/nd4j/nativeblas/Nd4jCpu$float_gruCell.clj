(ns org.nd4j.nativeblas.Nd4jCpu$float_gruCell
  "Implementation of gated Recurrent Unit cell:
 Kyunghyun Cho, Bart van Merrienboer, Caglar Gulcehre, Dzmitry Bahdanau, Fethi Bougares, Holger Schwenk, Yoshua Bengio
 \"Learning Phrase Representations using RNN Encoder-Decoder for Statistical Machine Translation\"
 Input arrays:
 0: input with shape [batchSize x inSize], batchSize - batch size, inSize - number of features
 1: previous cell output [batchSize x numUnits], that is at previous time step t-1
 2: input-to-hidden weights, [inSize x 3*numUnits]
 3: hidden-to-hidden weights, [numUnits x 3*numUnits]
 4: biases, [3*numUnits]
 Output arrays:
 0: current cell output [batchSize x numUnits], that is at current time step t"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCpu$float_gruCell]))

(defn ->float-gru-cell
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$float_gruCell [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$float_gruCell p))
  (^Nd4jCpu$float_gruCell []
    (new Nd4jCpu$float_gruCell )))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCpu$float_gruCell`"
  (^org.nd4j.nativeblas.Nd4jCpu$float_gruCell [^Nd4jCpu$float_gruCell this ^Long position]
    (-> this (.position position))))

(defn calculate-output-shape
  "Description copied from class: Nd4jCpu.FloatDeclarableOp

  input-shape - `org.nd4j.nativeblas.Nd4jCpu$ShapeList`
  block - `org.nd4j.nativeblas.Nd4jCpu$FloatContext`

  returns: `org.nd4j.nativeblas.Nd4jCpu$ShapeList`"
  (^org.nd4j.nativeblas.Nd4jCpu$ShapeList [^Nd4jCpu$float_gruCell this ^org.nd4j.nativeblas.Nd4jCpu$ShapeList input-shape ^org.nd4j.nativeblas.Nd4jCpu$FloatContext block]
    (-> this (.calculateOutputShape input-shape block))))

