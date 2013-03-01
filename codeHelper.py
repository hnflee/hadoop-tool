#!/usr/bin/env python
# -*- coding: utf-8 -*-
# filename: pexpect_test.py
'''
Created on 2013-03-01
@author: lifeng
'''

import pexpect
import os
import sys

if __name__=='__main__':
    print sys.argv[0]
    print sys.argv[1]
    if sys.argv[1]=='jar':
        command_output=os.system('ant jar')
    if sys.argv[1]=='deploy':
        command_output=os.system('ant jar') 
        command_output=os.system('scp build/bin/sqoop_export_job.jar   hadoop@jobtracker:/home/hadoop/sqoop/sqoop_export_job.jar')
        if command_output==0:
            print "deploy file is ok! "
