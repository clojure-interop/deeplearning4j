(ns org.nd4j.nativeblas.Nd4jCpu$RandomBuffer
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCpu$RandomBuffer]))

(defn ->random-buffer
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$RandomBuffer [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$RandomBuffer p)))

(defn *rotl
  "k - `long`

  returns: `(value="uint64_t")   long rotl((value="const uint64_t") long x, @`"
  ([^Long k]
    (Nd4jCpu$RandomBuffer/rotl k)))

(defn *safe-shift
  "y - `long`

  returns: `(value="uint64_t")   long safeShift((value="uint64_t") long x, @`"
  ([^Long y]
    (Nd4jCpu$RandomBuffer/safeShift y)))

(defn get-next-element
  "returns: `(value="uint64_t")  long`"
  ([^Nd4jCpu$RandomBuffer this]
    (-> this (.getNextElement))))

(defn get-buffer
  "returns: `(value="uint64_t*")  org.bytedeco.javacpp.LongPointer`"
  ([^Nd4jCpu$RandomBuffer this]
    (-> this (.getBuffer))))

(defn set-seed
  "seed - `long`"
  ([^Nd4jCpu$RandomBuffer this ^Long seed]
    (-> this (.setSeed seed))))

(defn get-next-index
  "returns: `(value="Nd4jLong")  long`"
  ([^Nd4jCpu$RandomBuffer this]
    (-> this (.getNextIndex))))

(defn get-element
  "position - `long`

  returns: `(value="uint64_t")  long`"
  ([^Nd4jCpu$RandomBuffer this ^Long position]
    (-> this (.getElement position))))

(defn relative-u-int-64
  "This method returns random T in range [from..to]

  index - `long`

  returns: `(value="uint64_t")  long`"
  ([^Nd4jCpu$RandomBuffer this ^Long index]
    (-> this (.relativeUInt64 index))))

(defn relative-int
  "This method returns random int within [from..to]

  index - `long`
  from - `int`
  to - `int`

  returns: `int`"
  (^Integer [^Nd4jCpu$RandomBuffer this ^Long index ^Integer from ^Integer to]
    (-> this (.relativeInt index from to)))
  (^Integer [^Nd4jCpu$RandomBuffer this ^Long index ^Integer to]
    (-> this (.relativeInt index to)))
  (^Integer [^Nd4jCpu$RandomBuffer this ^Long index]
    (-> this (.relativeInt index))))

(defn next-int
  "This method returns random int in range [from..to]

  from - `int`
  to - `int`

  returns: `int`"
  (^Integer [^Nd4jCpu$RandomBuffer this ^Integer from ^Integer to]
    (-> this (.nextInt from to)))
  (^Integer [^Nd4jCpu$RandomBuffer this ^Integer to]
    (-> this (.nextInt to)))
  (^Integer [^Nd4jCpu$RandomBuffer this]
    (-> this (.nextInt))))

(defn seed-conv
  "seed - `long`

  returns: `(value="uint64_t")  long`"
  ([^Nd4jCpu$RandomBuffer this ^Long seed]
    (-> this (.seedConv seed))))

(defn get-device-buffer
  "returns: `(value="uint64_t*")  org.bytedeco.javacpp.LongPointer`"
  ([^Nd4jCpu$RandomBuffer this]
    (-> this (.getDeviceBuffer))))

(defn next-u-int-64
  "returns: `(value="uint64_t")  long`"
  ([^Nd4jCpu$RandomBuffer this]
    (-> this (.nextUInt64))))

(defn get-offset
  "returns: `(value="Nd4jLong")  long`"
  ([^Nd4jCpu$RandomBuffer this]
    (-> this (.getOffset))))

(defn increment-generation
  ""
  ([^Nd4jCpu$RandomBuffer this]
    (-> this (.incrementGeneration))))

(defn rewind-h
  "This method skips X elements from buffer

  number-of-elements - number of elements to skip - `long`"
  ([^Nd4jCpu$RandomBuffer this ^Long number-of-elements]
    (-> this (.rewindH number-of-elements))))

(defn get-allocated-size
  "returns: `(value="Nd4jLong")  long`"
  ([^Nd4jCpu$RandomBuffer this]
    (-> this (.getAllocatedSize))))

(defn next-64
  "shifted-seed - `long`

  returns: `(value="uint64_t")  long`"
  ([^Nd4jCpu$RandomBuffer this ^Long shifted-seed]
    (-> this (.next64 shifted-seed))))

(defn get-seed
  "returns: `(value="Nd4jLong")  long`"
  ([^Nd4jCpu$RandomBuffer this]
    (-> this (.getSeed))))

(defn re-seed
  "amplifier - `long`"
  ([^Nd4jCpu$RandomBuffer this ^Long amplifier]
    (-> this (.reSeed amplifier))))

(defn get-size
  "returns: `(value="Nd4jLong")  long`"
  ([^Nd4jCpu$RandomBuffer this]
    (-> this (.getSize))))

(defn set-offset
  "offset - `long`"
  ([^Nd4jCpu$RandomBuffer this ^Long offset]
    (-> this (.setOffset offset))))

