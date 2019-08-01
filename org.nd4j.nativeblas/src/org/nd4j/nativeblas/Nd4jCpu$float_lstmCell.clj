(ns org.nd4j.nativeblas.Nd4jCpu$float_lstmCell
  "Implementation of operation for LSTM cell with peep hole connections:
 S. Hochreiter and J. Schmidhuber. \"Long Short-Term Memory\". Neural Computation
 and
 https://research.google.com/pubs/archive/43905.pdf
 Hasim Sak, Andrew Senior, and Francoise Beaufays. \"Long short-term memory recurrent neural network architectures for large scale acoustic modeling.\" INTERSPEECH, 2014.
 Input arrays:
 0: input with shape [batchSize x inSize], batchSize - batch size, inSize - number of features
 1: previous cell output [batchSize x numProj], that is at previous time step t-1, in case of projection=false -> numProj=numUnits!!!
 2: previous cell state [batchSize x numUnits], that is at previous time step t-1
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
 0: current cell output [batchSize x numProj], that is at current time step t
 1: current cell state [batchSize x numUnits], that is at current time step t"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCpu$float_lstmCell]))

(defn ->float-lstm-cell
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$float_lstmCell [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$float_lstmCell p))
  (^Nd4jCpu$float_lstmCell []
    (new Nd4jCpu$float_lstmCell )))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCpu$float_lstmCell`"
  (^org.nd4j.nativeblas.Nd4jCpu$float_lstmCell [^Nd4jCpu$float_lstmCell this ^Long position]
    (-> this (.position position))))

(defn calculate-output-shape
  "Description copied from class: Nd4jCpu.FloatDeclarableOp

  input-shape - `org.nd4j.nativeblas.Nd4jCpu$ShapeList`
  block - `org.nd4j.nativeblas.Nd4jCpu$FloatContext`

  returns: `org.nd4j.nativeblas.Nd4jCpu$ShapeList`"
  (^org.nd4j.nativeblas.Nd4jCpu$ShapeList [^Nd4jCpu$float_lstmCell this ^org.nd4j.nativeblas.Nd4jCpu$ShapeList input-shape ^org.nd4j.nativeblas.Nd4jCpu$FloatContext block]
    (-> this (.calculateOutputShape input-shape block))))

