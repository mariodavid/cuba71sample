package com.company.cuba71sample.web.screens.customer;

import com.haulmont.cuba.gui.screen.*;
import com.company.cuba71sample.entity.Customer;

@UiController("cuba71sample_Customer.edit")
@UiDescriptor("customer-edit.xml")
@EditedEntityContainer("customerDc")
@LoadDataBeforeShow
public class CustomerEdit extends StandardEditor<Customer> {
}