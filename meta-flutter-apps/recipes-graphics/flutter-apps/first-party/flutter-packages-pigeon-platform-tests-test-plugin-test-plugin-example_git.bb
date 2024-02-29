#
# Copyright (c) 2020-2024 Joel Winarske. All rights reserved.
#

SUMMARY = "test_plugin_example"
DESCRIPTION = "Pigeon test harness for primary plugin languages."
AUTHOR = "Google"
HOMEPAGE = "None"
BUGTRACKER = "None"
SECTION = "graphics"

LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=a60894397335535eb10b54e2fff9f265"

SRCREV = "ccec918fd591e78a2f2c84d5e1607299288f5911"
SRC_URI = "git://github.com/flutter/packages.git;lfs=1;nobranch=1;protocol=https;destsuffix=git"

S = "${WORKDIR}/git"

PUBSPEC_APPNAME = "test_plugin_example"
FLUTTER_APPLICATION_INSTALL_SUFFIX = "flutter-packages-pigeon-platform-tests-test-plugin-test-plugin-example"
FLUTTER_APPLICATION_PATH = "packages/pigeon/platform_tests/test_plugin/example"

inherit flutter-app