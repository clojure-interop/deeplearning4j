(ns org.nd4j.nativeblas.Nd4jCpu$float_lstm
  "Implementation of operation \"LSTM time sequences\" with peep hole connections:
 Input arrays:
 0: input with shape [time x batchSize x inSize], time - number of time steps, batchSize - batch size, inSize - number of features
 1: initial cell output [batchSize x numProj], that is at time step = 0, in case of projection=false -> numProj=numUnits!!!
 2: initial cell state [batchSize x numUnits], that is at time step = 0
 3: input-to-hidden weights, [inSize x 4*numUnits]
 4: hidden-to-hidden weights, [numProj x 4*numUnits]
 5: diagonal weights for peephole connections [3*numUnits]
 6: projection weights [numUnits x numProj]
 7: biases, [4*numUnits]
 Input integer arguments:
 0: if not zero, provide peephole connections
 1: if not zero, then projection is performed, if zero then numProj==numUnits is mandatory!
 Input float arguments:
 0: clipping value for cell state, if it is not equal to zero, then cell state is clipped
 1: clipping value for projected cell output, if it is not equal to zero, then projected cell output is clipped
 2: the bias added to forget gates in order to reduce the scale of forgetting in the beginning of the training
 Output arrays:
 0: cell outputs [time x batchSize x numProj], that is per each time step
 1: cell states [time x batchSize x numUnits], that is per each time step"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCpu$float_lstm]))

(defn ->float-lstm
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$float_lstm [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$float_lstm p))
  (^Nd4jCpu$float_lstm []
    (new Nd4jCpu$float_lstm )))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCpu$float_lstm`"
  (^org.nd4j.nativeblas.Nd4jCpu$float_lstm [^Nd4jCpu$float_lstm this ^Long position]
    (-> this (.position position))))

(defn calculate-output-shape
  "Description copied from class: Nd4jCpu.FloatDeclarableOp

  input-shape - `org.nd4j.nativeblas.Nd4jCpu$ShapeList`
  block - `org.nd4j.nativeblas.Nd4jCpu$FloatContext`

  returns: `org.nd4j.nativeblas.Nd4jCpu$ShapeList`"
  (^org.nd4j.nativeblas.Nd4jCpu$ShapeList [^Nd4jCpu$float_lstm this ^org.nd4j.nativeblas.Nd4jCpu$ShapeList input-shape ^org.nd4j.nativeblas.Nd4jCpu$FloatContext block]
    (-> this (.calculateOutputShape input-shape block))))

