(ns org.nd4j.config.ND4JSystemProperties
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.config ND4JSystemProperties]))

(def *-dtype
  "Static Constant.

  Applicability: Always
  Description: Sets the default datatype for ND4J - should be one of \"float\", \"double\", \"half\".
  ND4J is set to float (32-bit floating point values) by default.

  type: java.lang.String"
  ND4JSystemProperties/DTYPE)

(def *-log-initialization
  "Static Constant.

  Applicability: Always
  Description: By default, ND4J will log some information when the library has completed initialization, such as the
  backend (CPU or CUDA), CPU/Devices, memory etc. This system property can be used to disable the logging of this
  initialization information

  type: java.lang.String"
  ND4JSystemProperties/LOG_INITIALIZATION)

(def *-javacpp-memory-max-bytes
  "Static Constant.

  Applicability: Always
  Description: This system property defines the maximum amount of off-heap memory that can be used.
  ND4J uses off-heap memory for storage of all INDArray data. This off-heap memory is a different
  pool of memory to the on-heap JVM memory (configured using standard Java Xms/Xmx options).
  Default: 2x Java XMX setting

  type: java.lang.String"
  ND4JSystemProperties/JAVACPP_MEMORY_MAX_BYTES)

(def *-javacpp-memory-max-physical-bytes
  "Static Constant.

  Applicability: Always
  Description: This system property defines the maximum total amount of memory that the process can use - it is
  the sum of both off-heap and on-heap memory. This can be used to provide an upper bound on the maximum amount
  of memory (of all types) that ND4J will use

  type: java.lang.String"
  ND4JSystemProperties/JAVACPP_MEMORY_MAX_PHYSICAL_BYTES)

(def *-dynamic-load-classpath-property
  "Static Constant.

  Applicability: always - but only if an ND4J backend cannot be found/loaded via standard ServiceLoader mechanisms
  Description: Set this property to a set fully qualified JAR files to attempt to load before failing on
  not loading a backend. JAR files should be semi-colon delimited; i.e., \"/some/file.jar;/other/path.jar\".
  This should rarely be required in practice - for example, only in dynamic class loading/dynamic classpath scenarios
  For equivalent system property, see ND4JEnvironmentVars.BACKEND_DYNAMIC_LOAD_CLASSPATH for the equivalent
  system property (the system property will take precidence if both are set)

  type: java.lang.String"
  ND4JSystemProperties/DYNAMIC_LOAD_CLASSPATH_PROPERTY)

(def *-version-check-property
  "Static Constant.

  Applicability: Always
  Description Setting the system property to false will stop ND4J from performing the version check, and logging any
  warnings/errors. By default, the version check is enabled.
  Note: the version check is there for a reason! Using incompatible versions of ND4J/DL4J etc is likely to cause
  issues, and should be avoided.

  type: java.lang.String"
  ND4JSystemProperties/VERSION_CHECK_PROPERTY)

(def *-databuffer-to-string-max-elements
  "Static Constant.

  Applicability: always
  Description: Used to specify the maximum number of elements (numbers) to print when using DataBuffer.toString().
  Use -1 to print all elements (i.e., no limit). This is usually to avoid expensive toString() calls on buffers
  which may have millions of elements - for example, in a debugger
  Default: 1000

  type: java.lang.String"
  ND4JSystemProperties/DATABUFFER_TO_STRING_MAX_ELEMENTS)

(def *-nd-4-j-cpu-load-openblas
  "Static Constant.

  Applicability: nd4j-native backend, when multiple BLAS libraries are available
  Description: This system property can be used to control which BLAS library is loaded and used by ND4J.
  For example, org.bytedeco.javacpp.openblas.load=mkl_rt can be used to load a default installation of MKL.
  However, MKL is liked with by default (when available) so setting this option explicitly is not usually required.
  For more details, see https://github.com/bytedeco/javacpp-presets/tree/master/openblas#documentation

  type: java.lang.String"
  ND4JSystemProperties/ND4J_CPU_LOAD_OPENBLAS)

(def *-nd-4-j-cpu-load-openblas-nolapack
  "Static Constant.

  Applicability: nd4j-native backend, when multiple BLAS libraries are available
  Description: This system property can be used to control which BLAS library is loaded and used by ND4J.
  Similar to ND4J_CPU_LOAD_OPENBLAS but when this is set, LAPACK will not be loaded

  type: java.lang.String"
  ND4JSystemProperties/ND4J_CPU_LOAD_OPENBLAS_NOLAPACK)

(def *-aeron-term-buffer-prop
  "Static Constant.

  Applicability: nd4j-parameter-server, dl4j-spark (gradient sharing training master)
  Description: Aeros in a high-performance communication library used in distributed computing contexts in some
  places in ND4J and DL4J. This term buffer length determines the maximum message length that can be sent via Aeron
  in a single message. It can be increased to avoid exceptions such as Encoded message exceeds maxMessageLength of 2097152,
  at the expense of increased memory consumption (memory consumption is a multiple of this). It is specified in bytes
  with no unit suffix. Default value: 33554432 (32MB).
  IMPORTANT: This value must be an exact power of 2.
  Note also the maximum effective size is 128MB (134217728) (due to Aeron internal limits - beyond which increasing
  the buffer size will have no effect)

  type: java.lang.String"
  ND4JSystemProperties/AERON_TERM_BUFFER_PROP)

