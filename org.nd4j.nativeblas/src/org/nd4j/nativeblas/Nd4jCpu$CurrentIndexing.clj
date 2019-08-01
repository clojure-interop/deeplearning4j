(ns org.nd4j.nativeblas.Nd4jCpu$CurrentIndexing
  "Indexing information
 for bounds checking"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCpu$CurrentIndexing]))

(defn ->current-indexing
  "Constructor.

  Native array allocator. Access with Pointer.position(long).

  size - `long`"
  (^Nd4jCpu$CurrentIndexing [^Long size]
    (new Nd4jCpu$CurrentIndexing size))
  (^Nd4jCpu$CurrentIndexing []
    (new Nd4jCpu$CurrentIndexing )))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCpu$CurrentIndexing`"
  (^org.nd4j.nativeblas.Nd4jCpu$CurrentIndexing [^Nd4jCpu$CurrentIndexing this ^Long position]
    (-> this (.position position))))

(defn num-elements-per-thread
  "num-elements-per-thread - `int`

  returns: `org.nd4j.nativeblas.Nd4jCpu$CurrentIndexing`"
  (^org.nd4j.nativeblas.Nd4jCpu$CurrentIndexing [^Nd4jCpu$CurrentIndexing this ^Integer num-elements-per-thread]
    (-> this (.numElementsPerThread num-elements-per-thread)))
  (^Integer [^Nd4jCpu$CurrentIndexing this]
    (-> this (.numElementsPerThread))))

(defn block-starting-index
  "block-starting-index - `int`

  returns: `org.nd4j.nativeblas.Nd4jCpu$CurrentIndexing`"
  (^org.nd4j.nativeblas.Nd4jCpu$CurrentIndexing [^Nd4jCpu$CurrentIndexing this ^Integer block-starting-index]
    (-> this (.blockStartingIndex block-starting-index)))
  (^Integer [^Nd4jCpu$CurrentIndexing this]
    (-> this (.blockStartingIndex))))

(defn starting-thread-index
  "starting-thread-index - `int`

  returns: `org.nd4j.nativeblas.Nd4jCpu$CurrentIndexing`"
  (^org.nd4j.nativeblas.Nd4jCpu$CurrentIndexing [^Nd4jCpu$CurrentIndexing this ^Integer starting-thread-index]
    (-> this (.startingThreadIndex starting-thread-index)))
  (^Integer [^Nd4jCpu$CurrentIndexing this]
    (-> this (.startingThreadIndex))))

(defn ending-thread-index
  "ending-thread-index - `int`

  returns: `org.nd4j.nativeblas.Nd4jCpu$CurrentIndexing`"
  (^org.nd4j.nativeblas.Nd4jCpu$CurrentIndexing [^Nd4jCpu$CurrentIndexing this ^Integer ending-thread-index]
    (-> this (.endingThreadIndex ending-thread-index)))
  (^Integer [^Nd4jCpu$CurrentIndexing this]
    (-> this (.endingThreadIndex))))

