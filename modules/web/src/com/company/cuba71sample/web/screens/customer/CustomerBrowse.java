package com.company.cuba71sample.web.screens.customer;

import com.haulmont.cuba.gui.screen.*;
import com.company.cuba71sample.entity.Customer;

@UiController("cuba71sample_Customer.browse")
@UiDescriptor("customer-browse.xml")
@LookupComponent("customersTable")
@LoadDataBeforeShow
public class CustomerBrowse extends StandardLookup<Customer> {
}