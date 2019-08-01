(ns org.nd4j.storage.CompressedRamStorage$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.storage CompressedRamStorage$Builder]))

(defn ->builder
  "Constructor."
  (^CompressedRamStorage$Builder []
    (new CompressedRamStorage$Builder )))

(defn set-compressor
  "This method defines, which compression algorithm will be used during storage
  Default value: NoOp();

  compressor - `org.nd4j.linalg.compression.NDArrayCompressor`

  returns: `org.nd4j.storage.CompressedRamStorage$Builder<T>`"
  (^org.nd4j.storage.CompressedRamStorage$Builder [^CompressedRamStorage$Builder this ^org.nd4j.linalg.compression.NDArrayCompressor compressor]
    (-> this (.setCompressor compressor))))

(defn use-inplace-compression
  "If set to TRUE, all store/update calls will use inplace compression.
  If set to FALSE, original array won't be modified, and copy will be used.
  Default value: FALSE;

  really-use - `boolean`

  returns: `org.nd4j.storage.CompressedRamStorage$Builder<T>`"
  (^org.nd4j.storage.CompressedRamStorage$Builder [^CompressedRamStorage$Builder this ^Boolean really-use]
    (-> this (.useInplaceCompression really-use))))

(defn emulate-is-absent
  "If set to TRUE, all Read/Write locks will be used to emulate storeIfAbsent behaviour
  If set to FALSE, concurrency will be provided by ConcurrentHashMap at Java7 level
  Default value: FALSE;

  really-emulate - `boolean`

  returns: `org.nd4j.storage.CompressedRamStorage$Builder<T>`"
  (^org.nd4j.storage.CompressedRamStorage$Builder [^CompressedRamStorage$Builder this ^Boolean really-emulate]
    (-> this (.emulateIsAbsent really-emulate))))

(defn build
  "returns: `org.nd4j.storage.CompressedRamStorage<T>`"
  (^org.nd4j.storage.CompressedRamStorage [^CompressedRamStorage$Builder this]
    (-> this (.build))))

